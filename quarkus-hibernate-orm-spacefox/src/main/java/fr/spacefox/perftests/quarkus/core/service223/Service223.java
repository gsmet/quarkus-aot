package fr.spacefox.perftests.quarkus.core.service223;

import fr.spacefox.perftests.quarkus.core.port.data.Entity223DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service223.model.Model223;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service223 {

    private final Entity223DatasourcePort datasource;

    public Service223(Entity223DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model223 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
