package org.crazyit.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 *
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class MainActivity extends Activity
{
	private TextView show;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		show = findViewById(R.id.show);
	}

	private AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder)
	{
		// 调用setPositiveButton方法添加“确定”按钮
		return builder.setPositiveButton("Sign in", (dialog, which) -> show.setText("单击了【确定】按钮！"));
	}
	private AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder)
	{
		// 调用setNegativeButton方法添加“取消”按钮
		return builder.setNegativeButton("Cancel", (dialog, which) -> show.setText("单击了【取消】按钮！"));
	}




	public void customView(View source)
	{
		// 加载\res\layout\login.xml界面布局文件
		TableLayout loginForm = (TableLayout) getLayoutInflater().inflate(R.layout.login, null);
		new AlertDialog.Builder(this)

				// 设置对话框显示的View对象
				.setView(loginForm)
				// 为对话框设置一个“确定”按钮
				.setPositiveButton("Sign in", (dialog, which) -> {
					// 此处可执行登录处理
				})
				// 为对话框设置一个“取消”按钮
				.setNegativeButton("Cancel", (dialog, which) -> {
					// 取消登录，不做任何事情
				})
				// 创建并显示对话框
				.create().show();

	}

}
