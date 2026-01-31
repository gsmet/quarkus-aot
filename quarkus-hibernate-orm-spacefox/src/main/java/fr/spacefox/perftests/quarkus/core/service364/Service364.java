package fr.spacefox.perftests.quarkus.core.service364;

import fr.spacefox.perftests.quarkus.core.port.data.Entity364DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service364.model.Model364;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service364 {

    private final Entity364DatasourcePort datasource;

    public Service364(Entity364DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model364 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
