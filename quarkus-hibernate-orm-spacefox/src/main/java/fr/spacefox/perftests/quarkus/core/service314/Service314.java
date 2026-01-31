package fr.spacefox.perftests.quarkus.core.service314;

import fr.spacefox.perftests.quarkus.core.port.data.Entity314DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service314.model.Model314;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service314 {

    private final Entity314DatasourcePort datasource;

    public Service314(Entity314DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model314 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
