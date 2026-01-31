package fr.spacefox.perftests.quarkus.core.service356;

import fr.spacefox.perftests.quarkus.core.port.data.Entity356DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service356.model.Model356;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service356 {

    private final Entity356DatasourcePort datasource;

    public Service356(Entity356DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model356 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
