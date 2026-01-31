package fr.spacefox.perftests.quarkus.core.service727;

import fr.spacefox.perftests.quarkus.core.port.data.Entity727DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service727.model.Model727;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service727 {

    private final Entity727DatasourcePort datasource;

    public Service727(Entity727DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model727 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
