package fr.spacefox.perftests.quarkus.core.service22;

import fr.spacefox.perftests.quarkus.core.port.data.Entity22DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service22.model.Model22;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service22 {

    private final Entity22DatasourcePort datasource;

    public Service22(Entity22DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model22 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
