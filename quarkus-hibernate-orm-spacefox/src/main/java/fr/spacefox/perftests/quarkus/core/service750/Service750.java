package fr.spacefox.perftests.quarkus.core.service750;

import fr.spacefox.perftests.quarkus.core.port.data.Entity750DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service750.model.Model750;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service750 {

    private final Entity750DatasourcePort datasource;

    public Service750(Entity750DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model750 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
