package fr.spacefox.perftests.quarkus.core.service606;

import fr.spacefox.perftests.quarkus.core.port.data.Entity606DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service606.model.Model606;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service606 {

    private final Entity606DatasourcePort datasource;

    public Service606(Entity606DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model606 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
