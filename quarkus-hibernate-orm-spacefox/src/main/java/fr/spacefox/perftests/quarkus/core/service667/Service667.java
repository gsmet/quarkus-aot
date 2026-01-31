package fr.spacefox.perftests.quarkus.core.service667;

import fr.spacefox.perftests.quarkus.core.port.data.Entity667DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service667.model.Model667;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service667 {

    private final Entity667DatasourcePort datasource;

    public Service667(Entity667DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model667 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
