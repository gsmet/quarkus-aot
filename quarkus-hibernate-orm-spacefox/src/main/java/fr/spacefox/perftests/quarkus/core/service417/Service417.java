package fr.spacefox.perftests.quarkus.core.service417;

import fr.spacefox.perftests.quarkus.core.port.data.Entity417DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service417.model.Model417;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service417 {

    private final Entity417DatasourcePort datasource;

    public Service417(Entity417DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model417 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
