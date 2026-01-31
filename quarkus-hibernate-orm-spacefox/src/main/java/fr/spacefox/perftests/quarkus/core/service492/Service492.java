package fr.spacefox.perftests.quarkus.core.service492;

import fr.spacefox.perftests.quarkus.core.port.data.Entity492DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service492.model.Model492;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service492 {

    private final Entity492DatasourcePort datasource;

    public Service492(Entity492DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model492 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
