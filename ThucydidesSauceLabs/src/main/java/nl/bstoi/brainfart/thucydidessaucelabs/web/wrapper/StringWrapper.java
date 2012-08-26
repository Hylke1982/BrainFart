package nl.bstoi.brainfart.thucydidessaucelabs.web.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@XmlRootElement
@Getter @Setter
public class StringWrapper {
	
	private String value;
	
	
	
	public StringWrapper(){
	}
	
	public StringWrapper(String value){
		this.value = value;
	}

}
