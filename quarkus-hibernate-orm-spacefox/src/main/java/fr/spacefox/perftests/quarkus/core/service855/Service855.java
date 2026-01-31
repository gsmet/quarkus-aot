package fr.spacefox.perftests.quarkus.core.service855;

import fr.spacefox.perftests.quarkus.core.port.data.Entity855DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service855.model.Model855;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service855 {

    private final Entity855DatasourcePort datasource;

    public Service855(Entity855DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model855 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
