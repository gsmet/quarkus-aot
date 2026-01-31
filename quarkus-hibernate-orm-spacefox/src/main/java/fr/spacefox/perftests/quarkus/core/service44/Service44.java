package fr.spacefox.perftests.quarkus.core.service44;

import fr.spacefox.perftests.quarkus.core.port.data.Entity44DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service44.model.Model44;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service44 {

    private final Entity44DatasourcePort datasource;

    public Service44(Entity44DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model44 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
