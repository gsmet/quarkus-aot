package fr.spacefox.perftests.quarkus.core.service345;

import fr.spacefox.perftests.quarkus.core.port.data.Entity345DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service345.model.Model345;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service345 {

    private final Entity345DatasourcePort datasource;

    public Service345(Entity345DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model345 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
