package com.example.lab1;

import java.util.Arrays;

import android.content.Context;
import android.hardware.SensorEvent;
import android.view.View;
import android.widget.LinearLayout;
import ca.uwaterloo.sensortoy.LineGraphView;

public class AccelerometerSensorEventListener extends GenericSensorListener
{

	private LineGraphView graph;

	public void onSensorChanged(SensorEvent se)
	{
		super.onSensorChanged(se);
		graph.addPoint(se.values);

	}

	public AccelerometerSensorEventListener(Context context, LinearLayout layout)
	{
		super(context,"Accelerometer");
	     graph = new LineGraphView(context, 100, Arrays.asList("x", "y", "z"));
		layout.addView(graph);
		graph.setVisibility(View.VISIBLE);

	}

}
