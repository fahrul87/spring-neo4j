package com.fahrul.springneo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.fahrul.springneo4j.node.Book;

public interface BookRepository extends Neo4jRepository<Book, String> {

	Book findByName(String name);

}
