package fr.spacefox.perftests.quarkus.core.service795;

import fr.spacefox.perftests.quarkus.core.port.data.Entity795DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service795.model.Model795;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service795 {

    private final Entity795DatasourcePort datasource;

    public Service795(Entity795DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model795 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
