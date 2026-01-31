package fr.spacefox.perftests.quarkus.core.service841;

import fr.spacefox.perftests.quarkus.core.port.data.Entity841DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service841.model.Model841;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service841 {

    private final Entity841DatasourcePort datasource;

    public Service841(Entity841DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model841 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
