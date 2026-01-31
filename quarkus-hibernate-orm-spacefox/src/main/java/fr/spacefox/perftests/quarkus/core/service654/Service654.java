package fr.spacefox.perftests.quarkus.core.service654;

import fr.spacefox.perftests.quarkus.core.port.data.Entity654DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service654.model.Model654;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service654 {

    private final Entity654DatasourcePort datasource;

    public Service654(Entity654DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model654 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
