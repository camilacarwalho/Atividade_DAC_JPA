package domain;

import domain.Telefone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-26T16:37:37")
@StaticMetamodel(Professor.class)
public class Professor_ extends Pessoa_ {

    public static volatile SingularAttribute<Professor, Double> salario;
    public static volatile SetAttribute<Professor, Telefone> telefones;

}