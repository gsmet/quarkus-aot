package fr.spacefox.perftests.quarkus.core.service393;

import fr.spacefox.perftests.quarkus.core.port.data.Entity393DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service393.model.Model393;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service393 {

    private final Entity393DatasourcePort datasource;

    public Service393(Entity393DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model393 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
