package fr.spacefox.perftests.quarkus.core.service311;

import fr.spacefox.perftests.quarkus.core.port.data.Entity311DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service311.model.Model311;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service311 {

    private final Entity311DatasourcePort datasource;

    public Service311(Entity311DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model311 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
