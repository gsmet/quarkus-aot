package fr.spacefox.perftests.quarkus.core.service858;

import fr.spacefox.perftests.quarkus.core.port.data.Entity858DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service858.model.Model858;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service858 {

    private final Entity858DatasourcePort datasource;

    public Service858(Entity858DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model858 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
