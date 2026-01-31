package fr.spacefox.perftests.quarkus.core.service255;

import fr.spacefox.perftests.quarkus.core.port.data.Entity255DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service255.model.Model255;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service255 {

    private final Entity255DatasourcePort datasource;

    public Service255(Entity255DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model255 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
