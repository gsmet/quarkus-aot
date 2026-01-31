package fr.spacefox.perftests.quarkus.core.service89;

import fr.spacefox.perftests.quarkus.core.port.data.Entity89DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service89.model.Model89;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service89 {

    private final Entity89DatasourcePort datasource;

    public Service89(Entity89DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model89 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
