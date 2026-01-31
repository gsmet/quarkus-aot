package fr.spacefox.perftests.quarkus.core.service229;

import fr.spacefox.perftests.quarkus.core.port.data.Entity229DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service229.model.Model229;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service229 {

    private final Entity229DatasourcePort datasource;

    public Service229(Entity229DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model229 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
