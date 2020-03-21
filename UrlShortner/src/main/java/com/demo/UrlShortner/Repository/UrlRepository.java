package com.demo.UrlShortner.Repository;
import com.demo.UrlShortner.Model.url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<url, String> {

	public url findBylUrl(String lUrl);
}