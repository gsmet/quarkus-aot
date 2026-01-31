package fr.spacefox.perftests.quarkus.core.service641;

import fr.spacefox.perftests.quarkus.core.port.data.Entity641DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service641.model.Model641;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service641 {

    private final Entity641DatasourcePort datasource;

    public Service641(Entity641DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model641 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
