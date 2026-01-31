package fr.spacefox.perftests.quarkus.core.service173;

import fr.spacefox.perftests.quarkus.core.port.data.Entity173DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service173.model.Model173;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service173 {

    private final Entity173DatasourcePort datasource;

    public Service173(Entity173DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model173 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
