package code.solutions;
/*
 * Copyright 2012 Mohan Singh.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class RightMostOccurance {

	
	public static int position(String s, char t){
		
		String revStr=new StringBuffer(s).reverse().toString();
		int pos=-1;
		int len=revStr.length();
		
		for(int i=0;i<len;i++){
			
			if(t==revStr.charAt(i)){
				pos=len-1-i;
				
			}
			
		}
		return pos;
		
	}
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			String temp[]=data.split(",");
			String s=temp[0];
			char t=temp[1].charAt(0);
			
			System.out.println(position(s, t));
			
			
		}

	}

}
