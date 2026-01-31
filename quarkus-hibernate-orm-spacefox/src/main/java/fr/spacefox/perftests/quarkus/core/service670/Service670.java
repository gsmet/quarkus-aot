package fr.spacefox.perftests.quarkus.core.service670;

import fr.spacefox.perftests.quarkus.core.port.data.Entity670DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service670.model.Model670;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service670 {

    private final Entity670DatasourcePort datasource;

    public Service670(Entity670DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model670 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
