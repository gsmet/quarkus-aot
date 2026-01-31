package fr.spacefox.perftests.quarkus.core.service746;

import fr.spacefox.perftests.quarkus.core.port.data.Entity746DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service746.model.Model746;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service746 {

    private final Entity746DatasourcePort datasource;

    public Service746(Entity746DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model746 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
