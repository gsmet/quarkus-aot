package fr.spacefox.perftests.quarkus.core.service548;

import fr.spacefox.perftests.quarkus.core.port.data.Entity548DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service548.model.Model548;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service548 {

    private final Entity548DatasourcePort datasource;

    public Service548(Entity548DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model548 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
