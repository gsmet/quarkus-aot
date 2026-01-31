package fr.spacefox.perftests.quarkus.core.service857;

import fr.spacefox.perftests.quarkus.core.port.data.Entity857DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service857.model.Model857;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service857 {

    private final Entity857DatasourcePort datasource;

    public Service857(Entity857DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model857 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
