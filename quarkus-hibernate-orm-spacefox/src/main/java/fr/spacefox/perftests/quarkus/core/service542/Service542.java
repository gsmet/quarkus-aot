package fr.spacefox.perftests.quarkus.core.service542;

import fr.spacefox.perftests.quarkus.core.port.data.Entity542DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service542.model.Model542;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service542 {

    private final Entity542DatasourcePort datasource;

    public Service542(Entity542DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model542 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
