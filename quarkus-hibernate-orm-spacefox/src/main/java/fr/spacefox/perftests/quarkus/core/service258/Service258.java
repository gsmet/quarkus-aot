package fr.spacefox.perftests.quarkus.core.service258;

import fr.spacefox.perftests.quarkus.core.port.data.Entity258DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service258.model.Model258;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service258 {

    private final Entity258DatasourcePort datasource;

    public Service258(Entity258DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model258 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
