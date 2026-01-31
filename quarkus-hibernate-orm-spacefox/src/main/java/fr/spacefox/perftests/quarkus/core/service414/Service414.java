package fr.spacefox.perftests.quarkus.core.service414;

import fr.spacefox.perftests.quarkus.core.port.data.Entity414DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service414.model.Model414;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service414 {

    private final Entity414DatasourcePort datasource;

    public Service414(Entity414DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model414 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
