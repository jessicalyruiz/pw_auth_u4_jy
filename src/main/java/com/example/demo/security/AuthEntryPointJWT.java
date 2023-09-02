package com.example.demo.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;



@Component
public class AuthEntryPointJWT implements AuthenticationEntryPoint {

	private static final Logger LOG=LoggerFactory.getLogger(AuthEntryPointJWT.class);
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		LOG.error("unathorized error {}", authException.getMessage());
		
		LOG.error(request.getServletPath());
		
		
	}

}

/*

public class AuthTokenFilter extends OncePerRequestFilter{

	private static final Logger LOG=LoggerFactory.getLogger(AuthTokenFilter.class);

	
	@Autowired
	private JwtUtils jwtUtils;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		String jwt=this.parseJwt(request);
		if(jwt!=null && this.jwtUtils.validateJwtToken(jwt)) {
			//como es valido el token, lo authentico
			String nombre= this.jwtUtils.getUsrNameFromJwtToken(jwt);
			//////////////// atuenticacion
			UsernamePasswordAuthenticationToken authentication=new UsernamePasswordAuthenticationToken(nombre, null, new ArrayList<>());
			
			authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(authentication); //seteo la authenticacion en la session
			LOG.info("************unername  "+nombre);
		}
		}catch (Exception e) {
			// TODO: handle exception
			LOG.error("no se pudo realizar la authencicacion cfon el token enviado: {}", e.getMessage());
			
		}
		filterChain.doFilter(request, response);//procesar le filtro
	}

	private String parseJwt(HttpServletRequest request) {
		String valorCompleto=request.getHeader("Authorization");
		if(StringUtils.hasText(valorCompleto)&& valorCompleto.startsWith("Bearer ")) {
			return valorCompleto.substring(7, valorCompleto.length());
		}
		return null; 
	}
	
	
}
*/