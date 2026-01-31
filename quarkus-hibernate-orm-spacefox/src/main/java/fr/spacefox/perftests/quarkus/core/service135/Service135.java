package fr.spacefox.perftests.quarkus.core.service135;

import fr.spacefox.perftests.quarkus.core.port.data.Entity135DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service135.model.Model135;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service135 {

    private final Entity135DatasourcePort datasource;

    public Service135(Entity135DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model135 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
