package fr.spacefox.perftests.quarkus.core.service701;

import fr.spacefox.perftests.quarkus.core.port.data.Entity701DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service701.model.Model701;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service701 {

    private final Entity701DatasourcePort datasource;

    public Service701(Entity701DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model701 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
