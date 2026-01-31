package fr.spacefox.perftests.quarkus.core.service241;

import fr.spacefox.perftests.quarkus.core.port.data.Entity241DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service241.model.Model241;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service241 {

    private final Entity241DatasourcePort datasource;

    public Service241(Entity241DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model241 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
