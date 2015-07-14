package cl.dgac.arsv.mant.remote;

import java.util.List;

import javax.ejb.Remote;

import cl.dgac.arsv.exceptions.ARSVBusinessException;
import cl.dgac.arsv.model.ArsvRuta;

@Remote
public interface RutaServicesRemote {
	public ArsvRuta guardarRuta(ArsvRuta arsvRuta) throws ARSVBusinessException;
	
	public ArsvRuta actualizarRuta(ArsvRuta arsvRuta) throws ARSVBusinessException;
	
	public ArsvRuta buscarRuta(Long idArsvRuta) throws ARSVBusinessException;
	
	public void eliminarRuta(ArsvRuta arsvRuta) throws ARSVBusinessException;

	public List<ArsvRuta> buscarRuta() throws ARSVBusinessException;
	
}
