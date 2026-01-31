package fr.spacefox.perftests.quarkus.core.service884;

import fr.spacefox.perftests.quarkus.core.port.data.Entity884DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service884.model.Model884;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service884 {

    private final Entity884DatasourcePort datasource;

    public Service884(Entity884DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model884 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
