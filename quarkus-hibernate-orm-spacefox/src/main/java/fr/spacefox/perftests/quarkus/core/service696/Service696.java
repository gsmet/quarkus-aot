package fr.spacefox.perftests.quarkus.core.service696;

import fr.spacefox.perftests.quarkus.core.port.data.Entity696DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service696.model.Model696;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service696 {

    private final Entity696DatasourcePort datasource;

    public Service696(Entity696DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model696 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
