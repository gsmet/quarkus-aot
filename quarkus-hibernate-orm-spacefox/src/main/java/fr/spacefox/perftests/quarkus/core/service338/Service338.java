package fr.spacefox.perftests.quarkus.core.service338;

import fr.spacefox.perftests.quarkus.core.port.data.Entity338DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service338.model.Model338;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service338 {

    private final Entity338DatasourcePort datasource;

    public Service338(Entity338DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model338 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
