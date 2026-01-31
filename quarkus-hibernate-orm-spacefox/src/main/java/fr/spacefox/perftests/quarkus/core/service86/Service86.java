package fr.spacefox.perftests.quarkus.core.service86;

import fr.spacefox.perftests.quarkus.core.port.data.Entity86DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service86.model.Model86;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service86 {

    private final Entity86DatasourcePort datasource;

    public Service86(Entity86DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model86 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
