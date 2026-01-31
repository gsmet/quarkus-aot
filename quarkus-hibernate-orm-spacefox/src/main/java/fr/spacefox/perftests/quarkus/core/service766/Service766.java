package fr.spacefox.perftests.quarkus.core.service766;

import fr.spacefox.perftests.quarkus.core.port.data.Entity766DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service766.model.Model766;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service766 {

    private final Entity766DatasourcePort datasource;

    public Service766(Entity766DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model766 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
