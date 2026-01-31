package fr.spacefox.perftests.quarkus.core.service913;

import fr.spacefox.perftests.quarkus.core.port.data.Entity913DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service913.model.Model913;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service913 {

    private final Entity913DatasourcePort datasource;

    public Service913(Entity913DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model913 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
