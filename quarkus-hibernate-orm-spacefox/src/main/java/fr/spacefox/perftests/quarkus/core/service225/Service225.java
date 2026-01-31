package fr.spacefox.perftests.quarkus.core.service225;

import fr.spacefox.perftests.quarkus.core.port.data.Entity225DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service225.model.Model225;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service225 {

    private final Entity225DatasourcePort datasource;

    public Service225(Entity225DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model225 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
