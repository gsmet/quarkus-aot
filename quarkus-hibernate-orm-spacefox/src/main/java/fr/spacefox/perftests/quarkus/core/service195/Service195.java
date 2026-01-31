package fr.spacefox.perftests.quarkus.core.service195;

import fr.spacefox.perftests.quarkus.core.port.data.Entity195DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service195.model.Model195;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service195 {

    private final Entity195DatasourcePort datasource;

    public Service195(Entity195DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model195 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
