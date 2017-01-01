

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
public class employee_salary 
{

  public static class myMapper extends Mapper<LongWritable, Text, Text, Text>
  {
	  public void map(LongWritable key, Text value, Context context)
	  {
		  try{
			  String[] str = value.toString().split(",");
			  String gender = str[3];
			  context.write(new Text(gender), new Text(value));
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
  }
  
  public static class myPartitioner extends Partitioner <Text, Text>
  {
	  public int getPartition(Text key, Text value, int numReduceTasks)
	  {
		  String[] str = value.toString().split(",");
		  int age = Integer.parseInt(str[2]);
		  if(age<=20)
		  {
			  return 0;
		  }
		  else if (age>20 && age<=30)
		  {
			  return 1;
		  }
		  else
		  {
			  return 2;
		  }
		  
	  }
  }
	  

  public static class myReducer extends Reducer<Text, Text, Text,IntWritable> 
  {
	  public int max_salary = -1;
	 // private Text outputkey  = new Text();

    public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException 
    {
    	for(Text val : values)
    	{
    	//	outputkey.set(key);
    		String[] str = val.toString().split(",");
    		if(Integer.parseInt(str[4])>max_salary)
    		{
    			max_salary = Integer.parseInt(str[4]);
    		}    		
    	}
    	context.write(key, new IntWritable(max_salary));
    }
  }

  public static void main(String[] args) throws Exception 
  {
    Configuration conf = new Configuration();
    Job job = Job.getInstance(conf, "Salary");
    job.setJarByClass(employee_salary.class);
    job.setMapperClass(myMapper.class);
    job.setMapOutputKeyClass(Text.class);
    job.setMapOutputValueClass(Text.class);
    job.setPartitionerClass(myPartitioner.class);
    job.setNumReduceTasks(3);
    job.setReducerClass(myReducer.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}