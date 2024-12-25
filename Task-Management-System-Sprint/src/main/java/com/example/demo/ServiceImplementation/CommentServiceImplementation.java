package com.example.demo.ServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.DeleteFailsException;
import com.example.demo.Model.Comment;
import com.example.demo.Repository.CommentRepository;
import com.example.demo.Service.CommentService;

@Service
public class CommentServiceImplementation implements CommentService{
	
	@Autowired
	private CommentRepository cr;

	@Override
	public void DeleteCommentById(int commentid) {
		
		Optional<Comment> oc = cr.findById(commentid);
		
		if(oc.isEmpty()) {
			throw new DeleteFailsException("DLTFAILS","Comments doesn't exist");
		}
		else {
			Comment c = oc.get();
			cr.delete(c);
		}
		
	}

}
