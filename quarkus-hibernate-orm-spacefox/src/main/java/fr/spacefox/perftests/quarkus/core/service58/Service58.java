package fr.spacefox.perftests.quarkus.core.service58;

import fr.spacefox.perftests.quarkus.core.port.data.Entity58DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service58.model.Model58;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service58 {

    private final Entity58DatasourcePort datasource;

    public Service58(Entity58DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model58 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
